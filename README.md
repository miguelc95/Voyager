# Set Up

export CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH"
alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
alias grun='java org.antlr.v4.gui.TestRig'

# To run in Java

antlr4 Voyager.g4 <br/>
javac Voyager*.java <br/>
grun Voyager program -gui input.txt<br/>
grun Voyager program <br/>
grun Voyager program -tokens <br/>


# To run in Python

antlr4 -Dlanguage=Python3 Voyager.g4 <br/>
python3 __main__.py input.txt <br/>
