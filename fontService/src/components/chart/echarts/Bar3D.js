import React from 'react'
import echarts from 'echarts/lib/echarts' //必须
import 'echarts/lib/component/tooltip'
import 'echarts/lib/component/grid'
import 'echarts/lib/chart/line'
import ReactEcharts from 'echarts-for-react';


export default class LineReact extends React.Component {
  
  constructor(props) {
    super(props)
//  this.getAllDay()

    this.initPie = this.initPie.bind(this)
   
  }
  componentWillMount(){
  
  }
  initPie() {
    const { option={} } = this.props //外部传入的data数据
    let myChart = echarts.init(this.ID) //初始化echarts 
    //设置options
    myChart.setOption(option)
    window.onresize = function() {
      myChart.resize()
    }
  }
  
  componentDidMount() {
   
    this.initPie()
  }
  
  componentDidUpdate() {

      this.initPie()
  }
  
//render() {
//  const { width="100%", height="300px" } = this.props
//  return <div ref={ID => this.ID = ID} style={{width, height}}></div>
//}
      render(){
      	const { width="100%", height="300px" } = this.props
        return(
            <div ref={ID => this.ID = ID}
                style={{height: '700px', width: '100%'}}
            ></div>
        )
    }
}
