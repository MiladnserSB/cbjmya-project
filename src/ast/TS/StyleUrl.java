package ast.TS;

import ast.ASTNode;

    public class StyleUrl implements ASTNode {
        private String url;

        public StyleUrl(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }

        @Override
        public void prettyPrint(String indent) {
            System.out.println(indent + "StyleUrl: " + url);
        }

        @Override
        public String toString() {
            return "StyleUrl='" + url + "'";
        }
    }
