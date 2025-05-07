package hello.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	// webブラウザーに文字を表示させる
	// URL 「～/hello」
	@GetMapping("/hello")
	public String getHello() {
		return "<h1>Hello</h1>";
	}
}
