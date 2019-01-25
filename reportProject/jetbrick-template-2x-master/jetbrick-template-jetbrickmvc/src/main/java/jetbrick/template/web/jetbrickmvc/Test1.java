////package jetbrick.template.web.jetbrickmvc;
////
////import jetbrick.template.runtime.parser.grammer.JetTemplateParser.Directive_define_expressionContext;
////import java.util.LinkedList;
////import java.util.Properties;
////import jetbrick.template.JetEngine;
////import jetbrick.template.JetGlobalContext;
////import jetbrick.template.parser.AstCodeVisitor;
////import jetbrick.template.parser.ParserContext;
////import jetbrick.template.parser.ast.AstExpression;
////import jetbrick.template.parser.ast.AstExpressionList;
////import jetbrick.template.parser.ast.AstInvokeNewObject;
////import jetbrick.template.parser.ast.AstOperatorEquals;
////import jetbrick.template.parser.ast.AstTernaryOperator;
////import jetbrick.template.parser.ast.AstValueEscaped;
////import jetbrick.template.parser.ast.Position;
////import jetbrick.template.resolver.GlobalResolver;
////import jetbrick.template.runtime.parser.grammer.JetTemplateParser;
////
////
////public class Test1 {
////	public static void main(String[] args) {
////	      Properties properties0 = new Properties();
////	      // Undeclared exception!
////	      try { 
////	        JetEngine.create(properties0, "");
////	      } catch(IllegalStateException e) {
////	         //
////	         // java.io.FileNotFoundException
////	         //
//////	         verifyException("jetbrick.config.ConfigLoader", e);
////	    	  e.printStackTrace();
////	      }
////	}
////}
//package jetbrick.template.web.jetbrickmvc;
//
//public class Test1{
//	public static void main(String[] args)  throws Throwable  {
//        new jetbrick.template.web.jetbrickmvc.JetTemplateViewHandler().doRender(new jetbrick.template.parser.AstCodeVisitor(new jetbrick.template.parser.ParserContext(null,null)),new jetbrick.template.runtime.parser.grammer.JetTemplateParser.Directive_define_expressionContext(org.antlr.v4.runtime.tree.Trees.getRootOfSubtreeEnclosingRegion(null,0,0),0));
//	}
//}
//
