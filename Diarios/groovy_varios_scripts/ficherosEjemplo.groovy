def myFile = new File('example.txt')

println myFile.text

def myScanner = new Scanner(myFile)

while (myScanner.hasNextLine()) {
	def line = myScanner.nextLine()
	println(line)
}
myScanner.close()


new FileWriter("example.txt", true).with {
	write("Hello world\n")
	flush()
}