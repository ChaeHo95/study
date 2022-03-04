package model2.mvcboard;

import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import fileupload.FileUtil;
import utils.JSFunction;

public class WriteController extends HttpServlet {
	
	//[글쓰기] 작성폼으로 진입하기 위한 메서드. 단순히 글쓰기 페이지로 포워드만 해줌
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/MVCBoard/Write.jsp").forward(req, resp);
	}
	
	//[글쓰기] 파일 업로드 처리 후 일반 글쓰기 처리 진행
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1. 파일 업로드 처리(업로드 디렉터리의 몰리적 경로)
		String saveDirectory = req.getServletContext().getRealPath("/Uploads");
		System.out.println(saveDirectory+"나와");
		//초기화 매개 변수로 설정한 첨부 파일 최대 용량 확인
		ServletContext application = getServletContext();
		int maxPostSize = Integer.parseInt(application.getInitParameter("maxPostSize"));
		
		//파일 업로드
		MultipartRequest mr = FileUtil.uploadFile(req, saveDirectory, maxPostSize);
		if(mr == null) {
			//파일 업로드 실패
			JSFunction.alertLocation(resp, "첨부 파일의 크기 초과", "../mvcboard/write.do");
			return;
		}
		//2. 파일 업로드 외 처리
		// 풀값을 DTO에 저장
		MVCBoardDTO dto=new MVCBoardDTO();
		dto.setName(mr.getParameter("name"));
		dto.setTitle(mr.getParameter("title"));
		dto.setContent(mr.getParameter("content"));
		dto.setPass(mr.getParameter("pass"));
		
		//원본 파일명,저장된 파일명 변경
		String fileName=mr.getFilesystemName("ofile");
		if(fileName!=null) {
			//한글 ,특수문자 처리
			String now=new SimpleDateFormat("yyyyMMdd_HmsS").format(new Date());
			String ext=fileName.substring(fileName.lastIndexOf("."));
			String newFileName=now+ext;
			
			//파일명 변경
			File oldFile=new File(saveDirectory+File.separator + fileName);
			File newFile=new File(saveDirectory+File.separator + newFileName);
			oldFile.renameTo(newFile);
			
			dto.setOfile(fileName);//원래파일명
			dto.setSfile(newFileName);//서버저장파일명
		}
		//DAO를 통해 DB에 계시 내용 저장
		MVCBoardDAO dao=new MVCBoardDAO();
		int result=dao.insertWrite(dto);
		dao.close();
		
		if(result==1) {//성공하면 목록으로감
			resp.sendRedirect("../mvcboard/list.do");
		}
		else {//실패하면 다시쓰러감
			resp.sendRedirect("../WebContent/MVCBoard/write.do");
		}
	}
}
