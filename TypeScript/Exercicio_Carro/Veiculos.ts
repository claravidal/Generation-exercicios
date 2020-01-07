export class Veiculos { 

    //Atributos

    private _rodas: string;
    private _cor: string;
    

    public getrodas(): string {
        return this._rodas;
    }
    public setrodas(value: string) {
        this._rodas = value;
    }

    public getcor(): string {
        return this._cor;
    }
    public setcor(value: string) {
        this._cor = value;
    }
 
}