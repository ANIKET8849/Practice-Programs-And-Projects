function Nav(props){
    return(
        <section>
            <nav className="navbar navbar-expand-lg bg-sucess">
  <div className="container-fluid">
    <a className="navbar-brand" href="#">
      {props.NavLeft}
    </a>
    <button
      className="navbar-toggler"
      type="button"
      data-bs-toggle="collapse"
      data-bs-target="#navbarSupportedContent"
      aria-controls="navbarSupportedContent"
      aria-expanded="false"
      aria-label="Toggle navigation"
    >
      <span className="navbar-toggler-icon" />
    </button>
    <div className="collapse navbar-collapse" id="navbarSupportedContent">
      <ul className="navbar-nav me-auto mb-2 mb-lg-0">
        <li className="nav-item">
          <a className="nav-link active" aria-current="page" href="#">
            {props.NavItems[0]}
          </a>
        </li>
        <li className="nav-item">
          <a className="nav-link" href="#">
          {props.NavItems[1]}
          </a>
        </li>
        <li className="nav-item dropdown">
          <a
            className="nav-link dropdown-toggle"
            href="#"
            role="button"
            data-bs-toggle="dropdown"
            aria-expanded="false"
          >
            {props.NavItems[2]}
          </a>
        </li>
        <li className="nav-item">
          <a className="nav-link disabled">{props.NavItems[3]}</a>
        </li>
      </ul>
      <form className="d-flex" role="search">
        <input
          className="form-control me-2"
          type="search"
          placeholder="Search"
          aria-label="Search"
        />
        <button className="btn btn-outline-success" type="submit">
          {props.BText}
        </button>
      </form>
    </div>
  </div>
</nav>

        </section>
    );
}

export default Nav;