"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var Veiculos_1 = require("./Veiculos");
var Carro = /** @class */ (function (_super) {
    __extends(Carro, _super);
    function Carro() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Carro.prototype.getcambio = function () {
        return this._cambio;
    };
    Carro.prototype.setcambio = function (value) {
        this._cambio = value;
    };
    Carro.prototype.getmarca = function () {
        return this._marca;
    };
    Carro.prototype.setmarca = function (value) {
        this._marca = value;
    };
    //Metodos
    Carro.prototype.trocarDeMarcha = function () {
        console.log("Troca pra primeira!");
    };
    Carro.prototype.freiar = function () {
        console.log("Cuidado com o limite de velocidade!");
    };
    return Carro;
}(Veiculos_1.Veiculos));
exports.Carro = Carro;
