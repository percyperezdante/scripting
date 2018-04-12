#include <unistd.h>
#include <stdio.h>

# This is sample code for reading options from command line
# This is a sample for reference for internal practicals

int main (int argc, char *argv[]){
	int opt;
	while((opt=getopt(argc,argv,"ab:c"))!=-1){
		switch(opt){
			case 'a':
				break;
			case 'c':
				printf("Optional Argument \"%s \"\n",optarg);
				break;
			case 'b':
				printf("Mandatory Argument \"%s \"\n",optarg);
				break;
			case ':':
			case '?':
			default:
				printf("Invalid option or missing argument;'-%c'\n",optopt);
				break;
		}
	}
	return 0;
}
