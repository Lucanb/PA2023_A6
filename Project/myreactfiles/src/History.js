import './App.css';
import DataTable from "react-data-table-component";
import {useState,useEffect} from 'react';
const dbConfig =require('dbConfig');
const oracledb= require('oracledb');
function History() {
    const[data,setData]=useState([])
    const[loading,setLoading] = useState(false)
    const[perPage,setPerPage] = useState(10)

    useEffect(()=>{
        fetchData()
    },[])
    async function fetchData(){
         setLoading(true)
        // const response = await fetch("https://jsonplaceholder.typicode.com/todos")
        // const users = await response.json()
        // setData(users)
        // setLoading(false)
        try{
            const connection = await oracledb.getConnection(dbConfig);
            const result = await connection.execute("select * from users"); //History trb
            const rows = await result.rows  //.json();
            setData(rows)
            await connection.close();
        }catch(e){
            console.log('Error fetching the data:',e);
        }
        setLoading(false);
    }
    const columns=[
        {
            name: "USERNAME",
            selector: (row) => row.USERNAME,
        },
        {
            name: "EMAIL",
            selector: (row) => row.EMAIL,
        },
        {
            name: "DONE",
            selector: (row) => row.completed ? "completed" : "not completed",
        },
    ]
   return (
      <div className="App">
         <DataTable
         title="History"
         columns={columns}
         data={data}
         progressPending={loading}
         pagination={perPage}
         />
      </div>
   )
}
export default History;
