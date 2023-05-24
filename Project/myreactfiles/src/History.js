import {Link} from "react-router-dom";
import './App.css'

function History() {
    return (
        <div className="container">
            <div className="row">
                <div className="card">
                    <div className="card-headder">
                        <h4>your History
                            <Link to= "/history">Next</Link>
                        </h4>
                    </div>
                    <div className="card-body">
                        <table className="table table-striped">
                            <thead>
                            <tr>
                                <th>Name</th>
                                <th>To Name</th>
                                <th>Data</th>
                                <th>Average</th>
                            </tr>
                            </thead>
                            <tbody>

                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
);
}

export default History;