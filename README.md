# To run in Java

antlr4 Voyager.g4
javac Voyager*.java
grun Voyager program -gui
grun Voyager program
grun Voyager program -tokens


# To run in Python

antlr4 -Dlanguage=Python3 Voyager.g4
python3 __main__.py input.txt
