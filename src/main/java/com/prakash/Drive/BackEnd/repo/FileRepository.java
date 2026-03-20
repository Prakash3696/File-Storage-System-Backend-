package com.prakash.Drive.BackEnd.repo;

import com.prakash.Drive.BackEnd.entity.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<FileEntity,Long> {

}
