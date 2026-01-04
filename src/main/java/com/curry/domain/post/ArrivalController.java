package com.curry.domain.post;

import com.curry.domain.departure.DepartureRequest;
import com.curry.domain.departure.DepartureService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ArrivalController {

    private final ArrivalService arrivalService;
    private final DepartureService departureService;

    // 입국정보 작성
    @GetMapping("/immigration/write.do")
    public String openArrivalWrite(Model model) {
        return "immigration/write";
    }

    // 출국정보 작성
    @GetMapping("/immigration/writeD.do")
    public String openDepartureWrite(Model model) {
        return "immigration/writeD";
    }

    // 입국정보 저장
    @PostMapping("/immigration/finish.do")
    public String saveArrival(final ArrivalRequest params){
        arrivalService.saveArrival(params);
        return "redirect:/finish";
    }

    // 출국정보 저장
    @PostMapping("/immigration/finish_.do")
    public String saveDeparture(final DepartureRequest params){
        departureService.saveDeparture(params);
        return "redirect:/finish";
    }

    // 신청 완료 페이지로 이동
    @GetMapping("/finish")
    public String openFinish(Model model){
        return "finish";
    }

    //입국정보 입력 페이지로 이동
    @GetMapping("immigration/write")
    public String moveArrival() {
        return "immigration/write";
    }

    //출국정보 입력 페이지로 이동
    @GetMapping("immigration/writeD")
    public String moveDeparture() {
        return "writeD";
    }

    //메인페이지로 이동
    @GetMapping("/")
    public String moveMain() {
        return "index";
    }
}
