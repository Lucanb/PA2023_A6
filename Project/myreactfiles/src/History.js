import './App.css';
import DataTable from "react-data-table-component";
import {useState,useEffect} from 'react';

function History() {
    const[data,setData]=useState([])
    const[loading,setLoading] = useState(false)
    const[perPage,setPerPage] = useState(10)

    useEffect(()=>{
        fetchData()
    },[])
    async function fetchData(){
        setLoading(true)
        const response = await fetch("https://jsonplaceholder.typicode.com/todos")
        const users = await response.json()
        setData(users)
        setLoading(false)
    }
    const columns=[
        {
            name: "Name",
            selector: (row) => row.userId,
        },
        {
            name: "Username",
            selector: (row) => row.title,
        },
        {
            name: "email",
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
