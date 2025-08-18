import React from 'react';
import './App.css';
import GroceryList from './myreactfiles/GroceryList1'; 
import Car2 from './myreactfiles/Car2'; 
import Phone3 from './myreactfiles/Phone3';
import SweetsList from './myreactfiles/SweetsList4';
import Electronics from './myreactfiles/Electronics5';
import CanteenMenu from './myreactfiles/CanteenMenu6';
import JuiceList from './myreactfiles/JuiceList7';
import Restaurant from './myreactfiles/Restaurant8';
import TempleList from './myreactfiles/TempleList9';
import TailorShop from './myreactfiles/TailorShop10';
import Fruits from './myreactfiles/Fruits11';
import TelivisionManager from './myreactfiles/TelivisionManager12';
import MarriageForm from './myreactfiles/MarriageForm13';
import AccessoriesForm from './myreactfiles/AccessoriesForm';
import BakingForm from './myreactfiles/BakingForm';




function App() {
  const groceries = ["Butter", "Rice", "Pulses", "Milk", "Millets"];

  return (
    <div className="App">
      <GroceryList items={groceries} /> {/* groceries is a prop being passed to GroceryList.*/}
      <Car2 brand=" Maruthi Suzuki" model="Swift" color="Grey" year="2020" />
      <Phone3 />
      <SweetsList />
      <Electronics />
      <CanteenMenu />
      <JuiceList />
      <Restaurant />
      <TempleList />
      <TailorShop />
      <Fruits />
      <TelivisionManager />
      <MarriageForm />
      <AccessoriesForm />
      <BakingForm />
    
    </div>
  );
}

export default App;
