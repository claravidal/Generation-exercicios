import { Veiculos } from "./Veiculos";


export class Moto extends Veiculos {

    //Atributos
    private _ano: string;
    private _marca: string;

    public get ano(): string {
        return this._ano;
    }
    public set ano(value: string) {
        this._ano = value;
    }

    public get marca(): string {
        return this._marca
    }
    public set marca(value: string) {
        this._marca = value;
    }

  
    //Metodos
    acelerarnamao() {
        console.log("Acelera! ")
    }
    freiarnamao() {
        console.log("Cuidado para não empinar ")
    }
}