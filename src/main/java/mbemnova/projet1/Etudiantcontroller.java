package mbemnova.projet1;

import mbemnova.projet1.model.Etudiant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping

public class Etudiantcontroller {
    @GetMapping("/etudiant")
    public List<Etudiant>getEtudiants(){
        return List.of(
                new Etudiant(1L,"Alice Nkomo", "Informatique"),
                new Etudiant(2L,"Bob tchamda","Reseau"),
                new Etudiant(3l,"caroleMbida","Genie civil"),
                new Etudiant(4l,"david essama", "informatique")

                );
    }
}
