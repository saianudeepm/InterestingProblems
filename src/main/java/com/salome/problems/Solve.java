package com.salome.problems;

/**
 * Created by saianudeepm on 9/11/15.
 */


/*
* Please use this Google doc to code during your interview. To free your hands for coding, we recommend that you use a headset or a phone with speaker option.


Language corpose where you analyze all the words, phrases that exsting, users queries typed in Google. Knowledge graph that understand every semantics of the words/phrases.

A new query comes, I want to know how you can interpretat that
Dict[“where to buy”, “snow”, “white”, “snow white”,”mountain”,”view”,”near”]

Let me know if you can use the phrases to parse the query.

“Where to buy a snow white dress near mountain view”.->true
“buy a snow white shoe near mtv”->false

“where to buy a shoe”

where
where to
where to buy
where to|buy a| buy a shoe|

public class ParseQuery {

String []input;
Dictionary dictionary;
boolean hasSolution;
NgramSolution ngramSolution;

ParseQuery(String []input, Dictionary dictionary){
	this.input=input;
	this.dictionary=dictionary;
}

//use calls this method to find out if possible after constructing the object.
public boolean isPossible(){
	backtrack(0);
//return solution
return hasSolution;
}

//recursively backtrack and figure out solutoin
private void backtrack(int k){




// check if we have a solution
if(isSOlution())
	return;
}

else{
	k++;
	constructCandidateSet();
	candidate[] // array of possible candidate words
	int nCandidates = candidate.length;
	int currentCandidate = 0;
	for(int i=0;i<input.length;i++){

//we have to do something
if(currentCandidate < nCandidates){
ngramSolution.addNewNgram(candidate[currentCandidate]);
 	backtrack(k);
// we have to undo something
ngramSolution.removeNgram(candidate[currentCandidate++]);
}
Hi, Sai, please do not edit anymore, thanks :)
no pro, I’ll mention that in my feedback.
Good luck. u 2
okay thanks.. could have gone better with out these distrubances but pleasure talking to u . Thank you have a good day.
	//terminating condition.check if we got an answer already. if we did terminate
		if(hasSolution)
			return;
}

}
//responsible to check if the current ngramSolution is a possible solution.
//sets the member variable hasSolution to true if found solution.
private boolean isSOlution(){
	//check the solution vector constructed till this point using backtrack
	boolean works=true;
for(Ngram ngram: this.ngramSolution){
		//look up each ngram in the dictionary and see if its present
		if(!this.dictionary.contains(ngram))
			works=false;
}
if(works)
	this.hasSolution=true;//over here
}

}
okay sure. okay will do.
Sorry I think I got disconnect. I’ll call you back, we can extend for 10 min
I’d like to know how you implement isSolution(), keep going.


* * * * * * * */
public class Solve {
    
    
    public static void main(String args[]){
        
        
        
    }
}
