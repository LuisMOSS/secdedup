package pt.lanware.secdedup;

public interface SDProto {
	
	static final byte DEVICE_SIGN  = 1;
	static final byte DEVICE_ID    = 2;
	static final byte BHASH	  	   = 3;
	static final byte FHASH	  	   = 4;
	static final byte HASH_OK  	   = 5;
	static final byte HASH_DUP 	   = 6;
	static final byte FILE_CHUNCK  = 7;
	static final byte CHUNCK_OK    = 8;
	static final byte CHUNCK_ERROR = 9;
	static final byte FILE_OK      = 10;
	static final byte FILE_ERROR   = 11;
	static final byte BLOCK		   = 12;
	static final byte BLOCK_OK 	   = 13;
	static final byte BLOCK_ERROR  = 14;
	static final byte RESULTS      = 97;
	static final byte RESULTS_OK   = 98;
	static final byte PROC_CANCEL  = 99;
	static final byte PROC_END     = 100;

}
