-- A basic legal Cool program

class Main inherits IO{
	x: Int <- 4;
	main():IO { 
		{
		out_string("The number is:\n");
		out_int(x);
		}		
	};
}; 
(*Comment*)