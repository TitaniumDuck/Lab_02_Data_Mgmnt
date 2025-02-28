// Rule 00 - Input Validation and Data Sanitization (IDS)
// Part ISD03-J - Do Not Log Unsanitized User Input

if( loginSuccessful) {
  logger.servre(" User login succeeded for: " + sanitizeUser(username));
} else {
  logger.servre(" User login failed for: " + sanitizeUser(username));
}
public String sanitizeUser(String username) {
  return Pattern.matches(" [A-Za-z0-9_]+", username)
    ? username : "unauthorized user";
}
