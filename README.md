# Diffie-Hellman
Diffie-Hellman key exchange algorithm in java

**************THEORY******************
U1 and U2 are two users who wish to communicate.

  U1-> R=Q^a mod P ;
	U2-> S=Q^b mod P ;
	Exchange R and S;
	U1-> R1=S^a mod P;
	U2-> S1=R^b mod P;
	if(R1==S1)
		SUCCESS. Can continue communication.
	else
		FAILURE. Try again :(

