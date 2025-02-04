import Nav from './Navbar';
import './App.css';

function App() {

  const navName = "React JS"
  const NavOptions = ["Home","Link","Dropdown","Disabled"];
  const Button = "Submit";

  return (
    <div className="App">
      <Nav NavLeft={navName} NavItems={NavOptions} BText={Button}/>
    </div>
  );
}



export default App;
