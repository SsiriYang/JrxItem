import React, { Component } from 'react';
import { Table, Icon, Popconfirm } from 'antd';
import moment from 'moment';

export default class FormTable extends Component{
    constructor(props){
        super(props);
    }
    render(){
        const { checkChange, onDelete, editClick, dataSource, loading } = this.props;
        const rowSelection = {
                onChange: checkChange,
                getCheckboxProps: record => ({
                disabled: record.name === 'Disabled User', // Column configuration not to be checked
            }),
        };
        const columns = [{
            title: '交易id',
            dataIndex: 'transId',
            width: 50,
        }, {
            title: '客户号',
            dataIndex: 'custId',
            sorter: (a, b) => a.custId - b.custId,
            width: 50,
        }, {
            title: '账户号',
            dataIndex: 'account',
//          sorter: (a, b) => a.age - b.age,
            width: 50,
        },{
            title: '卡号',
            dataIndex: 'cardNbr',
            width: 50,
        },{
            title: '交易流水号',
            dataIndex: 'tranno',
                 
            width: 80,
        },{
            title: '账单月',
            dataIndex: 'monthNbr',
            sorter: (a, b) => a.monthNbr - b.monthNbr,    
            width: 80,
        },{
            title: '交易金额',
            dataIndex: 'bill',
            sorter: (a, b) => a.bill - b.bill,    
            width: 80,
        },{
            title: '交易类型',
            dataIndex: 'transType',
            filters: [
                { text: '消费', value: '消费' },
                { text: '还款', value: '还款' },
            ],
            onFilter: (value, record) => record.transType.indexOf(value) === 0,
            width: 80,
            
        },{
            title: '交易日期',
            dataIndex: 'txnDatetime',
            width: 80,
        },{
            title: '操作',
            dataIndex: 'opera',
            width:100,
            render: (text, record) =>
                <div className='opera'>
                    <span onClick={() => editClick(record.key)}>
                         <Icon type="edit" /> 修改
                    </span><br />
                    <span><Popconfirm title="确定要删除吗?" onConfirm={() => onDelete(record.key)}><Icon type="minus-square-o" /> 删除 </Popconfirm></span>
                </div>
        }];
        return(
            <Table
                rowSelection={rowSelection}
                columns={columns}
                dataSource={dataSource}
                bordered={true}
                scroll={{x:'100%'}}
                className='formTable'
                loading={loading}
            />
        )
    }
}
