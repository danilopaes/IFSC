import { Component } from '@angular/core';

@Component({
  selector: 'app-tab3',
  templateUrl: 'tab3.page.html',
  styleUrls: ['tab3.page.scss']
})
export class Tab3Page {
  public peso: any;
  public altura: any;
  public imc: any;
  public mensagem: any;

  constructor() {}
  calculaIMC(){
    this.imc=this.peso/(this.altura**2);
    this.imc=this.imc.toFixed(2);
    if(this.imc<18.5){
      this.mensagem="Abaixo do peso";
    }else if(this.imc<24.9)
      this.mensagem="Peso normal";
    else if(this.imc<29.9)
      this.mensagem="Exesso de peso";
    else if(this.imc<34.9)
      this.mensagem="Obesidade grau 1";
    else if(this.imc<39.9)
      this.mensagem="Obesidade grau 2";
    else
      this.mensagem="Obesidade grau 3";
  }
}
