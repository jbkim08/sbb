package com.mysite.sbb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.question.QuestionService;
import com.mysite.sbb.user.SiteUser;
import com.mysite.sbb.user.UserService;

@SpringBootTest
class SbbApplicationTests {

//	@Autowired
//	private QuestionRepository qRepo;
//	
//	@Autowired
//	private AnswerRepository aRepo;
	
	@Autowired
	private QuestionService qService;
	
	@Autowired
	private UserService uService;

	@Test
	void contextLoads() {
		
		SiteUser user = uService.getUser("hong");
		
		for(int i=2 ; i <= 300; i++) {
			String subject = String.format("테스트 데이터입니다:[%03d]", i);
			String content = "내용무";
			this.qService.create(subject, content, user);
		}
		
//		Question q1 = new Question();
//		q1.setSubject("sbb가 무엇인가요?");
//		q1.setContent("sbb에 대해서 알고 싶습니다.");
//		q1.setCreateDate(LocalDateTime.now()); //현재날짜시간
//		qRepo.save(q1);
//        Question q2 = new Question();
//        q2.setSubject("스프링부트 모델 질문입니다.");
//        q2.setContent("id는 자동으로 생성되나요?");
//        q2.setCreateDate(LocalDateTime.now());
//        this.qRepo.save(q2);  // 두번째 질문 저장  

//		List<Question> all = qRepo.findAll();
//		assertEquals(2, all.size());
//		
//		for(Question q : all) {
//			System.out.println(q.getSubject()); //질문제목
//		}

//		Optional<Question> oq = qRepo.findById(1);
//		if(oq.isPresent()) {
//			Question q = oq.get();
//			System.out.println(q.getContent()); //첫번째 질문내용
//		}

//		Question q = qRepo.findBySubject("sbb가 무엇인가요?");
//		assertEquals(1, q.getId());

		// 데이터 수정하기
//		Optional<Question> oq = this.qRepo.findById(1);
//		assertTrue(oq.isPresent()); //true 체크
//		Question q = oq.get();
//		q.setSubject("수정된 제목");
//		this.qRepo.save(q); // save(id없을경우) : update(id있을경우)
		
		//삭제하기
		//qRepo.deleteById(1); //두번째 질문 삭제

		//답변 테스트
//        Optional<Question> oq = this.qRepo.findById(4);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//        
//        Answer a = new Answer();
//        a.setContent("네 자동으로 생성됩니다.");
//        a.setQuestion(q);  // 어떤 질문의 답변인지 알기위해서 Question 객체가 필요하다.
//        a.setCreateDate(LocalDateTime.now());
//        this.aRepo.save(a);
		
		//조회
//        Optional<Answer> oa = this.aRepo.findById(1);
//        assertTrue(oa.isPresent());
//        Answer a = oa.get();
//        assertEquals(4, a.getQuestion().getId());	
		
		

	}

}












