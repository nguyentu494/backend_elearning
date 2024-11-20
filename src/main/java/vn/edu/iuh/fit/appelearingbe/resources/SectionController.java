/*
 * @ (#) SectionController.java    1.0    11/20/2024
 *
 *
 */

package vn.edu.iuh.fit.appelearingbe.resources;
/*
 * @Description:
 * @Author: Nguyen Thanh Thuan
 * @Date: 11/20/2024
 * @Version: 1.0
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.appelearingbe.models.Section;
import vn.edu.iuh.fit.appelearingbe.repositories.SectionRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sections")
public class SectionController {

    @Autowired
    private SectionRepository sectionRepository;

    @GetMapping
    public ResponseEntity<List<Section>> getAllSections() {
        return ResponseEntity.ok(sectionRepository.findAll());
    }
}
