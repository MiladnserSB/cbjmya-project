package ast;

import ast.CSS.CssDocument;
import ast.HTML.HTMLDocument;
import ast.TS.TsDocument;

public class Ast implements ASTNode {
    private TsDocument tsDecument;
    private CssDocument cssDocument;
    private HTMLDocument htmlDocument;

    public Ast(TsDocument tsDecument, HTMLDocument htmlDocument, CssDocument cssDocument ) {
        this.tsDecument = tsDecument;
        this.cssDocument = cssDocument;
        this.htmlDocument = htmlDocument;
    }

    public TsDocument getTsDecument() {
        return tsDecument;
    }

    public HTMLDocument getHtmlDocument() {
        return htmlDocument;
    }

    public CssDocument getCssDocument() {
        return cssDocument;
    }

    public void setTsDecument(TsDocument tsDecument) {
        this.tsDecument = tsDecument;
    }

    public void setHtmlDocument(HTMLDocument htmlDocument) {
        this.htmlDocument = htmlDocument;
    }

    public void setCssDocument(CssDocument cssDocument) {
        this.cssDocument = cssDocument;
    }

    public TsDocument getTSDocument() {
        return tsDecument;
    }

    public CssDocument getCSSDocument() {
        return cssDocument;
    }

    public HTMLDocument getHTMLDocument() {
        return htmlDocument;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "AST:");
        if (tsDecument != null) {
            System.out.println(indent + "  TSDocument:");
            tsDecument.prettyPrint(indent + "    ");
        }

        if (htmlDocument != null) {
            System.out.println(indent + "  HTMLDocument:");
            htmlDocument.prettyPrint(indent + "    ");
        }
        if (cssDocument != null) {
            System.out.println(indent + "  CSSDocument:");
            cssDocument.prettyPrint(indent + "    ");
        }
    }
}