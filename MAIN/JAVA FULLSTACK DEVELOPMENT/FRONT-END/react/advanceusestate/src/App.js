import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
import './App.css';
import Component from './Component';

function App() {

  const myfunc=(x)=>{
    console.log(x)
  }
  return (
    <div className="App">
    <Component datavalue={myfunc}/>
    </div>
  );
}

export default App;
