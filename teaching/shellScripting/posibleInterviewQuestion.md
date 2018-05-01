#Linux based possible interview questions

The following questions were collected from differnt sources listed in the referene section.

### a) General 

1. What is LILO?
LILO is a boot loader for Linux. It is used mainly to load the Linux operating system into main memory so that it can begin its operations.

2. What is a swap space?
Swap space is a certain amount of space used by Linux to temporarily hold some programs that are running concurrently. This happens when RAM does not have enough memory to hold all programs that are executing.

3. What kind of information /proc stores?

	cpuinfo, 
	devices
	diskstats
	ioports
	meminfo,
	mounts,
	pagetypeinfo
	swaps
	version
	vnstat

4. How to check free memory?

meninfo, fre -m, vmstat, htop, top

5. What is the maximum length for a filename under Linux?

Any filename can have a maximum of 255 characters. This limit does not include the path name, so therefore the entire pathname and filename could well exceed 255 characters.

6.  What are the contents in /usr/local?

It contains locally installed files. This directory matters in environments where files are stored on the network. Specifically, locally-installed files go to /usr/local/bin, /usr/local/lib, etc.). Another application of this directory is that it is used for software packages installed from source, or software not officially shipped with the distribution.


7.  How you can run a Linux program in the background simultaneously when you start your Linux Server?

By using nohup.  It will stop the process receiving the NOHUP signal and thus terminating it you log out of the program which was invoked with.  & runs the process in the background.


8.- What is a hard link?

How xargs works?


### b) File system

### c) Process and IPC


## References

https://career.guru99.com/top-50-linux-interview-questions/
