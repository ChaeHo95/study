mport java.util.Scanner;
 
public class practice8 {   
   
   
   public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) { 
      if((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2)) return true; 
      else return false; 
   }
 
   
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("두 점 (x1,y1), (x2,y2)의 좌표를 입력하시오>>");
      int x1=sc.nextInt();
      int y1=sc.nextInt();
      int x2=sc.nextInt();
      int y2=sc.nextInt();
      
      boolean result;//사각형이 충돌하는지
      if (inRect(x1,y1,100,100,200,200) || inRect(x2,y2,100,100,200,200) || inRect(x1,y2,100,100,200,200) || inRect(x2,y1,100,100,200,200)) {
         result=true;
      }
      else if ((inRect(x1,y1,100,100,200,200)) && inRect(x2,y2,100,100,200,200) && inRect(x2,y1,100,100,200,200) && inRect(x1,y2,100,100,200,200)) {
         result=true;
      }
      else if ((inRect(100,100,x1,y1,x2,y2)) && inRect(100,200,x1,y1,x2,y2) && inRect(200,100,x1,y1,x2,y2) && inRect(200,200,x1,y1,x2,y2)) {
         result=true;
      }
      else {
         result=false;
      }
      
      //겹치면
      if(result) {
          System.out.println("사각형이 겹칩니다.");
      }
      //안겹치면
      else {
         System.out.println("사각형이 겹치지 않습니다.");
      }
      sc.close();
   