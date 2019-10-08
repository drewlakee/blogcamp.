package ru.aleynikov.blogcamp.dao;

import ru.aleynikov.blogcamp.model.Post;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public interface PostDao {

    void savePost(HashMap<String, Object> post);
    int findPostIdByUserIdAndTitle(int userId, String title);
    void setTagsToPost(Set<String> tags, HashMap<String, Object> post);
    List<Post> sortNewestPostsByUserId(int id, int offset, int limit);
    int countPostsByUserId(int id);
    List<Post> sortOldestPostsByUserId(int id, int offset, int limit);
    List<Post> findPostsByTitleUsingUserId(int id, int offset, int limit, String filter);
    int countPostsByFilterUsingUserId(int id,  String filter);
    Post findPostById(int id);
    List<Post> findPostsByTitle(int offset, int limit, String filter);
    int countByTitle(String filter);
    List<Post> sortNewestPosts(int offset, int limit);
    int count();
}
