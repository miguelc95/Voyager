import sys
from antlr4 import *
from Armstrong import Armstrong
from VoyagerLexer import VoyagerLexer
from VoyagerParser import VoyagerParser


def main(argv):
    input = FileStream(argv[1])
    lexer = VoyagerLexer(input)
    stream = CommonTokenStream(lexer)
    parser = VoyagerParser(stream)
    tree = parser.voyager()
    armstrong = Armstrong()
    walker = ParseTreeWalker()
    walker.walk(armstrong,tree)
    print("Hola")


if __name__ == '__main__':
    main(sys.argv)