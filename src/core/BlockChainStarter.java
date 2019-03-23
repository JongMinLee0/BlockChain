package core;

import java.util.ArrayList;

public class BlockChainStarter {

	public static void main(String[] args) {

//		int nonce = 0;
//		while(true) {
//			if(Util.getHash(nonce + "").substring(0,6).contentEquals("000000")) {
//				System.out.println("정답: " + nonce);
//				System.out.println("해시값: " + Util.getHash(nonce + ""));
//				break;
//			}
//			nonce++;
//		}
//		System.out.println(Util.getHash("이종민"));
// ---------------------------------------------------------- 이름을 해쉬값으로 구하기 / 해쉬값에서 정답 찾아내
//

//		Block block1 = new Block(1, null, 0, "데이터");
//		block1.mine(); // 채굴시작
//		block1.getInformation(); // 채굴 정보
//		
//		// 2번 이후로 모든 해쉬값이 변경된다.
//		Block block2 = new Block(2, block1.getBlockHash(), 0, "변조된데이터");
//		block2.mine(); // 채굴시작
//		block2.getInformation(); // 채굴 정보
//
//		Block block3 = new Block(3, block2.getBlockHash(), 0, "데이터");
//		block3.mine(); // 채굴시작
//		block3.getInformation(); // 채굴 정보
//
//		Block block4 = new Block(4, block3.getBlockHash(), 0, "데이터");
//		block4.mine(); // 채굴시작
//		block4.getInformation(); // 채굴 정보
// ---------------------------------------------------------- 블록체인 구현
//		Transaction transaction = new Transaction("이종민", "박정훈", 1.5);
//		System.out.println(transaction.getInformation());

		Block block1 = new Block(1, null, 0, new ArrayList());
		block1.mine();
		block1.getInformation();

		Block block2 = new Block(2, block1.getBlockHash(), 0, new ArrayList());
		block2.addTransaction(new Transaction("이종민", "박정훈", 1.5));
		block2.addTransaction(new Transaction("박성우", "박정훈", 0.7));
		block2.mine();
		block2.getInformation();

		Block block3 = new Block(3, block2.getBlockHash(), 0, new ArrayList());
		block3.addTransaction(new Transaction("이영언", "이호선", 8.5));
		block3.addTransaction(new Transaction("박성우", "이기승", 1.7));
		block3.mine();
		block3.getInformation();

		Block block4 = new Block(4, block3.getBlockHash(), 0, new ArrayList());
		block4.addTransaction(new Transaction("이기승", "박정훈", 0.1));
		block4.mine();
		block4.getInformation();

	}
}
