import React from "react";

class Book extends React.Component{
    state = {
        title: '해리포터',
        author: '조앤K롤링',
        summary: '해리포터가 마법사로 성장해나가는 과정을 그린 이야기',
        genre: '판타지 소설',
        release: '2003년 9월 4일',
        ISBN: '1234567890'
   }
    render(){
        
        return(
            <>
                <p>
                title: <br/>{this.state.title} <br/><br/>

                author: <br/>{this.state.author} <br/><br/>

                summary: <br/>{this.state.summary} <br/><br/>

                genre: <br/>{this.state.genre} <br/><br/>

                release: <br/>{this.state.release} <br/><br/>

                ISBN: <br/>{this.state.ISBN} <br/><br/>
                </p>
            </>
        )
    }
}

export default Book