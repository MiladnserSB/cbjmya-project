import antlr.Parsergrammar;
import antlr.Lexergrammmar;
import ast.ASTNode;
import ast.VISITOR.programvisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
public class Main {
    public static void main(String[] args) {


        String input = "import { Component, OnInit } from '@angular/core';\n" +
                "import { ProductsService } from '../../services/products.service';\n" +
                "import { NgFor, NgIf } from '@angular/common';\n" +
                "\n" +
                "\n" +
                "@Component({\n" +
                "  selector: 'app-products',\n" +
                "  imports: [NgFor,NgIf],\n" +
                "  templateUrl: './products.component.html',\n" +
                "  styleUrl: './products.component.css'\n" +
                "})\n" +
                "export class ProductsComponent implements OnInit{\n" +
                "  items: any[] = [];\n" +
                "  selectedItem:any=null;\n" +
                "\n" +
                "getProducts (){return 0;}"+
                "  constructor(private productsService: ProductsService) { }\n" +
                "  ngOnInit(): void {\n" +
                "     this.items = this.productsService.getProducts();\n" +
                "  }\n" +
"onselect(item: any):void {this.selectedItem = item;}"+
                "}\n" +
                "\n" +
                "\n" +
                "<div class=\"container\">\n" +
                "\n" +
                "    <div class=\"product-list\">\n" +
                "      <div *ngFor=\"let item of items\" class=\"product-card\" (click)=\"onselect(item)\">\n" +
                "        <img [src]=\"item.image\" alt=\"{{ item.name }}\">\n" +
                "        <h3>{{item.name }}</h3>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "\n" +
                "\n" +
                "    <div class=\"product-details\" *ngIf=\"selectedItem\">\n" +
                "      <h2>{{ selectedItem.name }}</h2>\n" +
                "      <img [src]=\"selectedItem.image\" alt=\"{{ selectedItem.name }}\">\n" +
                "      <p>price: {{ selectedItem.price }} sp </p>\n" +
                "      <p>colorItem: {{ selectedItem.color }}</p>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "\n" +
                "  .container {\n" +
                "      display: flex;\n" +
                "      justify-content: space-between;\n" +
                "      padding: 20px;\n" +
                "    }\n" +
                "\n" +
                "    .product-list {\n" +
                "      width: 90%;\n" +
                "      display: flex;\n" +
                "      flex-direction: column;\n" +
                "      align-items: flex-end;\n" +
                "      flex-wrap: wrap;\n" +
                "      gap: 20px;\n" +
                "    }\n" +
                "\n" +
                "    .product-card {\n" +
                "      width: 200px;\n" +
                "      text-align: center;\n" +
                "      cursor: pointer;\n" +
                "    }\n" +
                "\n" +
                "    .product-card img {\n" +
                "      width: 100%;\n" +
                "      height: 110px;\n" +
                "      object-fit: cover;\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    .product-details {\n" +
                "      width: 50%;\n" +
                "      height: 400px;\n" +
                "      background-color: #f9f9f9;\n" +
                "      border: 1px solid #ddd;\n" +
                "      text-align: center;\n" +
                "      position: absolute;\n" +
                "      left: 200px;\n" +
                "      top: 180px;\n" +
                "    }\n" +
                "\n" +
                "    .product-details img {\n" +
                "      width: 200px;\n" +
                "      height: 200px;\n" +
                "      object-fit: cover;\n" +
                "    }\n"

                ;
        Lexergrammmar lexer = new Lexergrammmar(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Parsergrammar parser = new Parsergrammar(tokens);
        ParseTree tree = parser.ast();
        programvisitor visitor = new programvisitor();
        ASTNode ast = visitor.visit(tree);
        visitor.st.print();
        if (ast != null) {
            ast.prettyPrint("");
        } else {
            System.out.println("AST is null. Check the grammar and visitor implementation.");
        }
    }
}