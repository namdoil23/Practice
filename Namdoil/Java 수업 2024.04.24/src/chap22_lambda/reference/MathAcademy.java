package chap22_lambda.reference;

@FunctionalInterface
public interface MathAcademy {
	Academy getMathAcademy(String subject, int student, long lectureTime);
}
