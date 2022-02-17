import Rect, {Component} from 'react'

class Person extends Component{
    render(){
        const name = 'chaeho'
        const age = 28
        return(
            // JSX 문법 사용함
            //자바 스크립트 표현식 
                <Rect.Fragment>
                    <h3>{name}</h3>
                    <h4>{age}</h4>
                </Rect.Fragment>
            
        )
    }
}
export default Person