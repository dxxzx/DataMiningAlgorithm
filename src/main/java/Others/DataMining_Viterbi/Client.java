package Others.DataMining_Viterbi;

/**
 * 维特比算法
 * 
 * @author lyq
 * 
 */
public class Client {
	public static void main(String[] args) {
		// 状态转移概率矩阵路径
		String stmFilePath;
		// 混淆矩阵路径
		String cfFilePath;
		// 观察到的状态
		String[] observeStates;
		// 初始状态
		double[] initStatePro;
		ViterbiTool tool;

		stmFilePath = Client.class.getResource("stmatrix.txt").getPath();
		cfFilePath = Client.class.getResource("humidity-matrix.txt").getPath();

		initStatePro = new double[] { 0.63, 0.17, 0.20 };
		observeStates = new String[] { "Dry", "Damp", "Soggy" };

		tool = new ViterbiTool(stmFilePath, cfFilePath, initStatePro,
				observeStates);
		tool.calHMMObserve();
	}
}
