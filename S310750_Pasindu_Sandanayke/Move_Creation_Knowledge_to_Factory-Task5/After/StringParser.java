public class StringParser...
  public Node find(...) {
    ...
    return StringNode.createStringNode(
      textBuffer, textBegin, textEnd,
      parser.shouldDecodeNodes()
    );
  }