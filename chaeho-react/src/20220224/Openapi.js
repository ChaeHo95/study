import './api.css';
import { Component } from 'react';

class Openapi extends Component{
    constructor(props){
        super(props)
        this.state = {
          loading: true,
          cosmetic: []
        }
      }
     
      componentDidMount(){
        fetch('http://makeup-api.herokuapp.com/api/v1/products.json?brand=maybelline')
        .then( res => res.json())
        .then( result => {
          this.setState({loading: false, cosmetic : result})
        })
      }
    sortBtn = () =>{
        const productSort = this.state.loading
        console.log(productSort)
        if(!productSort){
            this.setState({loading: true})
        }else{
            this.setState({loading: false})
        }
    }
    render(){
        const cosmetic = this.state.loading ? [...this.state.cosmetic].sort((a,b) => a.price - b.price) : this.state.cosmetic
            return(
            <>
                <div className='header'>
                    <div className='sort-btns' onClick={this.sortBtn} style ={{display:'flex',justifyContent:'center',alignItems:'center'}}>Price</div>
                </div>
                <div className='root'>
                    {cosmetic.map( (product,key )=> {
                        return <div className='product' key={key}>
                                    <div className='product-img'>
                                        <img src= {product.image_link}/>
                                    </div>
                                    <div className='product-name'>
                                        {product.name}({product.price})
                                    </div>
                                    <div className='product-description'>
                                        {product.description}
                                    </div>
                                </div>
                    })}
                </div>
            </>   
            )
        }
    }


export default Openapi