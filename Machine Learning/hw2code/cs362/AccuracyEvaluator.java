package cs362;

import java.util.List;

public class AccuracyEvaluator extends Evaluator{
	@Override
	public double evaluate(List<Instance> instances, Predictor predictor) {
		// TODO Auto-generated method stub
		int num = 0;
		// record how many predictions are correct
		for(Instance instance: instances){
			ClassificationLabel label = (ClassificationLabel) instance.getLabel();
			if(label.toString().equals(predictor.predict(instance).toString()))
				num++;
		}
		System.out.println(num+" "+instances.size());
		// calculate the accuracy
		return (double)num/(double)instances.size();
	}

}
