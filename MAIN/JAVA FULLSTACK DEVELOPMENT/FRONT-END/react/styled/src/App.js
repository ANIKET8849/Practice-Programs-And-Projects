import Componentone from './Componentone';
import  Componentfour  from './Componentfour';

function App() {
  const data='React';
  return (
    <div className="App">
      <Componentone  value={data}/>
      <Componentfour/>
    </div>
  );
}

export default App;
