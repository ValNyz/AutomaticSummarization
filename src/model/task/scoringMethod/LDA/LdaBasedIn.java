package model.task.scoringMethod.LDA;

import model.task.VectorCaracteristicBasedIn;

public interface LdaBasedIn extends VectorCaracteristicBasedIn {

	//public void init(AbstractProcess currentProcess, Map<String,WordEmbeddings> dictionnary, double[][] theta, int K, int nbSentence) throws Exception;
	public void setTheta(double[][] theta);
	public void setK(int K);
	public void setNbSentence(int nbSentence);
	
}
