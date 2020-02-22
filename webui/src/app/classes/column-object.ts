export class ColumnObject {
    public height : number;
    public color : string;
    public width : number;
    public opacity : number;

    
    constructor (height:number,color:string,width:number, opacity:number){
        this.height = height;
        this.color = color;
        this.opacity = opacity;
        this.width = width;
    }
}
