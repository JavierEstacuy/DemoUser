package com.example.demo.user.repository;

import com.example.demo.user.model.dao.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

@Repository
@Slf4j
public class UserRepositoryToFile implements UserRepository{

    public UserEntity save(UserEntity userEntity) throws IOException {
        userEntity.setCreateDate(new Date());
        userEntity.setUpdateDate(new Date());
        saveEntityToFile(userEntity);
        return userEntity;
    }


    private void saveEntityToFile(UserEntity userEntity) throws IOException {
        String id = UUID.randomUUID().toString();
        userEntity.setId(id);
        //accede a la carperta del usuario
        String parent = System.getProperty("user.home");
        File folder = new File(parent + "/DataBaseExample");
        folder.mkdirs();

        File userFile = new File(folder.getAbsolutePath() + "/user.csv");
        FileWriter fw = new FileWriter(userFile.getAbsoluteFile(), true); //opción append habilitada!

        log.info("saving file:{}", userFile.getAbsolutePath());
        BufferedWriter bw = null;

        try {
            // Si el archivo no existe, se crea!
            if (!userFile.exists()) {
                userFile.createNewFile();
            }
            // flag true, indica adjuntar información al archivo.
            fw = new FileWriter(userFile.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(userEntity.toString());
            System.out.println("información agregada!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Cierra instancias de FileWriter y BufferedWriter
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}