import React, { Component } from 'react'; 
import BreadcrumbCustom from '../../common/BreadcrumbCustom';
import './chart.less';
import { Radio } from 'antd';
import LineReact from './Bar3D';
import PieReact from './PieReact';
import BarReact from './BarReact';

import LiquidFill from './LiquidFill';
import GlobelLayers from './GlobeLayers';
import WordCloud from './WordCloud';
import Dashboard from './Dashboard';
import axios from 'axios';

//饼图
export const pieOption = {
  tooltip: {
    trigger: 'item',
    formatter: "{a} <br/>{b}: {c} ({d}%)"
  },
  legend: {
    orient: 'vertical',
    x: 'left',
    data:['消费总金额','还款总金额']
  },
  series: [
    {
      name:'类别',
      type:'pie',
      radius: ['100%', '70%'],
      avoidLabelOverlap: false,
      label: {
        normal: {
          show: false,
          position: 'center'
        },
        emphasis: {
          show: true,
          textStyle: {
            fontSize: '30',
            fontWeight: 'bold'
          }
        }
      },
      labelLine: {
        normal: {
          show: false
        }
      },
      data:[
//      {value:335, name:'消费总金额'},
//      {value:310, name:'还款总金额'}
      ]
    }
  ]
};


//柱状图数据
export const barOption = {
  color: ['#3398DB'],
  tooltip : {
    trigger: 'axis',
    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
      type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
    }
  },
  grid: {
    left: '3%',
    right: '4%',
    bottom: '3%',
    containLabel: true
  },
  xAxis : [
    {
      type : 'category',
      data : [],
      axisTick: {
        alignWithLabel: true
      }
    }
  ],
  yAxis : [
    {
      type : 'value'
    }
  ],
  series : [
    {
      name:'用户近三个月的消费笔数',
      type:'bar',
      barWidth: '60%',
      data:[]
    }
  ]
};

//折线图
export const zxoption = {
title: {
    text: '交易总金额'
},
tooltip : {
    trigger: 'axis',
    axisPointer: {
      type: 'cross',
      label: {
        backgroundColor: '#6a7985'
      }
    }
},
//legend: {
//  data:['交易总金额']
//},
toolbox: {
    feature: {
      saveAsImage: {}
    }
},
grid: {
    left: '3%',
    right: '4%',
    bottom: '3%',
    containLabel: true
},
xAxis : [
    {
      type : 'category',
//    boundaryGap : false,
      data : []
    }
],
yAxis : [
    {
      type : 'value'
    }
],
series : [
    {
      name:'交易总金额',
      type:'line',
      stack: '总量',
      areaStyle: {normal: {}},
      data:['']
    }
]
};




const RadioGroup = Radio.Group;
export default class Echarts extends Component{
    constructor(props){
        super(props);
        this.state = {
            value: 1,
        }
    }
    getAllDay = () => {
       axios.get('http://localhost:8080/summary')
       		.then(function (result) {
       			console.log(result.data);
				if (result) {
				//初始化xAxis[0]的data
					zxoption.xAxis[0].data = [];
					for (var i = 0; i < result.data.length; i++) {
						zxoption.xAxis[0].data.push(result.data[i].transDate);
						
					}
				//初始化series[0]的data
					zxoption.series[0].data = [];
					for (var j = 0; j < result.data.length; j++) {
						zxoption.series[0].data.push(result.data[j].tranAmt);
						console.log(zxoption.series[0].data);
					}
				}
        	}.bind(this))
        	.catch(function (error) {
            	console.log(error);
        	})
        	

       
  	}
  	 getZz = () => {
       axios.get('http://localhost:8080/consumption')
       		.then(function (result) {
       			console.log(result.data);
				if (result) {
				//初始化xAxis[0]的data
					barOption.xAxis[0].data = [];
					for (var i = 0; i < result.data.length; i++) {
						barOption.xAxis[0].data.push(result.data[i].custId);
						
					}
				//初始化series[0]的data
					barOption.series[0].data = [];
					for (var j = 0; j < result.data.length; j++) {
						barOption.series[0].data.push(result.data[j].tranCnt);
						console.log(barOption.series[0].data);
					}
				}
        	}.bind(this))
        	.catch(function (error) {
            	console.log(error);
        	})	
  	 }
  	 
  	 getBt = () => {
       axios.get('http://localhost:8080/Proportion')
       		.then(function (result) {
       			console.log(result.data);
				if (result) {
				//初始化series[0]的data
					pieOption.series[0].data = [];
					var str = [];
					var str1 = {};
					str1.name = "消费总金额";
					str1.value = result.data[0].tranAmt;
					var str2 = {};
					str2.name = "还款总金额";
					str2.value = result.data[0].payAmt;
					str.push(str1);
					str.push(str2);
					pieOption.series[0].data = str;
				}
        	}.bind(this))
        	.catch(function (error) {
            	console.log(error);
        	})	
  	 }
	componentDidMount() {
		this.getAllDay()
		this.getZz()
		this.getBt()
		
	}
    
    
    
  
  render() {
    return (
      <div>
        
        <h2>近一个月每天的交易总金额</h2>
        <LineReact option={zxoption} />
        <hr/>
         <h2>饼图react组件实现</h2>
        <PieReact option={pieOption} />
        <hr/> 
        <h2>柱状图react组件实现</h2>
        <BarReact option={barOption} />
        <hr/>
        
      </div>
    );
  }
}