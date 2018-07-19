package com.bridgelabz.fundoonoteapp.note.repositories;

import java.util.List;
import java.util.Optional;
import com.bridgelabz.fundoonoteapp.note.models.ViewNoteDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.fundoonoteapp.note.models.Note;

@Repository
public interface NoteRespository extends MongoRepository<Note, String> {
	Optional<Note> findByNoteId(String noteId);

	Note findByUserIdAndNoteId(String UserId, String noteId);

	List<ViewNoteDTO> findAllByUserId(String userId);

	Long deleteNoteByIsTrashed(boolean trashed);
}
