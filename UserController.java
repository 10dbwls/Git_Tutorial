@Controller
public class UserController {
	//로그인 페이지로 이동
	@RequestMappting("/user/login.do")
	public String login(){
		logger.info("경로 : login")';

		return "user/login";
	}

	//회원추가 페이지로 이동
	@RequestMapping("/user/insert.do")
	public String insert() {
		logger.info("login: insert");
		return "user/insert";
	}

	//회원수정 페이지로 이동
	@RequestMapping("/user/update.do")
	public String update() {
		logger.info("login: update");
		return "user/update";
	}

	// master 브랜치에 주석 추가
	// 회원 탈퇴시 세션 삭제

	//회원삭제 페이지로 이동
	@RequestMapping("/user/delete.do")
	public String delete() {
		logger.info("login: delete");
		return "user/delete";
	}
}