package com.ecochallenges.config;


/*
@Component
@AllArgsConstructor
public class FirebaseAuthenticationFilter extends OncePerRequestFilter {

    private final UserRepository userRepository;

    /*
    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        String authHeader = request.getHeader("Authorization");

        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }

        try {
            String token = authHeader.substring(7);
            // Intentar verificar el token
            FirebaseToken decodedToken = FirebaseAuth.getInstance().verifyIdToken(token);
            String email = decodedToken.getEmail();

            Optional<User> userOptional = userRepository.findOneByEmail(email);

            if (userOptional.isPresent()) {
                User user = userOptional.get();
                List<SimpleGrantedAuthority> authorities = new ArrayList<>();
                authorities.add(new SimpleGrantedAuthority("ROLE_" + user.getRole().name()));

                Authentication auth = new UsernamePasswordAuthenticationToken(
                        user.getEmail(),
                        null,
                        authorities
                );

                SecurityContextHolder.getContext().setAuthentication(auth);
            }
        } catch (FirebaseAuthException e) {
            response.setStatus(HttpStatus.FORBIDDEN.value());
            response.getWriter().write("Token inválido: " + e.getMessage());
            return;
        }

        filterChain.doFilter(request, response);
    }



    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        String authHeader = request.getHeader("Authorization");

        if (authHeader == null) {
            filterChain.doFilter(request, response);
            return;
        }

        try {
            // Para desarrollo, simplemente verificar el usuario en la base de datos
            String email = "admin@ecochallenges.com"; // El email del admin
            Optional<User> userOptional = userRepository.findOneByEmail(email);

            if (userOptional.isPresent()) {
                User user = userOptional.get();
                List<SimpleGrantedAuthority> authorities = new ArrayList<>();
                authorities.add(new SimpleGrantedAuthority("ROLE_" + user.getRole().name()));

                Authentication auth = new UsernamePasswordAuthenticationToken(
                        user.getEmail(),
                        null,
                        authorities
                );

                SecurityContextHolder.getContext().setAuthentication(auth);
            }

        } catch (Exception e) {
            response.setStatus(HttpStatus.FORBIDDEN.value());
            return;
        }

        filterChain.doFilter(request, response);
    }
}
*/