import { iCambio } from './iCambio';
import { Veiculos } from "./Veiculos";
export class Carro extends Veiculos implements iCambio {

    //Atributos
    cor: string;
    private _cambio: string;
    private _marca: string;

  
    public getcambio(): string {
        return this._cambio;
    }
    public setcambio(value: string) {
        this._cambio = value;
    }

    public getmarca(): string {
        return this._marca;
    }
    public setmarca(value: string) {
        this._marca = value;
    }

    //Metodos
    trocarDeMarcha() {
        console.log("Troca pra primeira!")
    }
    freiar() {
        console.log("Cuidado com o limite de velocidade!")
    }
}