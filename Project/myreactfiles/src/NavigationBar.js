import {Link} from "react-router-dom";

function NavigationBar() {
    return (
        <nav className="navbar navbar-expand-lg bg-body-tertiary-shadow">
          <div className="container">
              {/*<Link className="navbar-brand" to "/" >History</Link>*/}
              <button className="navbar-toggler" type="button" data-bs-toggler="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                  <span className="nav-bar-toggle-icon"></span>
              </button>

              <div className="collapse navbar-collapse" id="navbarSupporter">
                  <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                      <li className="nav-item">
                          <Link className="nav-link active" to="/home">Home</Link>
                      </li>
                      {/*<li>*/}
                      {/*    <Link className="nav-link" to="/about-us">About us</Link>*/}
                      {/*</li>*/}
                      {/*<li>*/}
                      {/*    <Link className="nav-link" to="/contact-us">Contact us</Link>*/}
                      {/*</li>*/}
                      <li>
                          <Link className="nav-link" to="/history">History</Link>
                      </li>
                  </ul>
              </div>
          </div>
        </nav>
    )
}