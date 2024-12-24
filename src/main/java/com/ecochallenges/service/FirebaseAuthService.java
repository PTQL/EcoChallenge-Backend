package com.ecochallenges.service;


/*
@Service
@AllArgsConstructor
public class FirebaseAuthService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;
    private final FirebaseAuth firebaseAuth;  // Inyectado desde la configuración

    /*
    public AuthResponse login(AuthRequest request) {
        try {
            User user = userRepository.findOneByEmail(request.getEmail())
                    .orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado"));

            // Usar el firebaseAuth inyectado en lugar de getInstance()
            String customToken = firebaseAuth.createCustomToken(user.getEmail());
            UserProfileDTO profileDTO = modelMapper.map(user, UserProfileDTO.class);

            return new AuthResponse(customToken, profileDTO);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BadRequestException("Error de autenticación: " + e.getMessage());
        }
    }



    public AuthResponse login(AuthRequest request) {
        try {
            // Verificar si el usuario existe y la contraseña es correcta
            User user = userRepository.findOneByEmail(request.getEmail())
                    .orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado"));

            // Verificar contraseña
            if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
                throw new BadRequestException("Credenciales inválidas");
            }

            UserProfileDTO profileDTO = modelMapper.map(user, UserProfileDTO.class);

            // Retornar respuesta sin token
            return new AuthResponse("no-token-needed", profileDTO);
        } catch (Exception e) {
            throw new BadRequestException("Error de autenticación: " + e.getMessage());
        }
    }

    public UserProfileDTO signup(SignupFormDTO signupFormDTO) {
        try {
            if (userRepository.existsByEmail(signupFormDTO.getEmail())) {
                throw new BadRequestException("El email ya está siendo usado");
            }

            // Crear usuario en la base de datos directamente
            User user = modelMapper.map(signupFormDTO, User.class);
            user.setPassword(passwordEncoder.encode(signupFormDTO.getPassword()));
            user.setRole(User.Role.USER);
            user.setCreatedAt(LocalDateTime.now());
            user.updateFullName();

            userRepository.save(user);

            return modelMapper.map(user, UserProfileDTO.class);
        } catch (Exception e) {
            throw new BadRequestException("Error al crear usuario: " + e.getMessage());
        }
    }
    /*

    public UserProfileDTO signup(SignupFormDTO signupFormDTO) {
        try {
            if (userRepository.existsByEmail(signupFormDTO.getEmail())) {
                throw new BadRequestException("El email ya está siendo usado");
            }

            // Crear usuario en Firebase usando el firebaseAuth inyectado
            UserRecord.CreateRequest firebaseUser = new UserRecord.CreateRequest()
                    .setEmail(signupFormDTO.getEmail())
                    .setPassword(signupFormDTO.getPassword())
                    .setDisplayName(signupFormDTO.getFullName());

            firebaseAuth.createUser(firebaseUser);

            // Crear usuario en base de datos
            User user = modelMapper.map(signupFormDTO, User.class);
            user.setPassword(passwordEncoder.encode(signupFormDTO.getPassword()));
            user.setRole(User.Role.USER);
            user.setCreatedAt(LocalDateTime.now());
            user.updateFullName();

            userRepository.save(user);

            return modelMapper.map(user, UserProfileDTO.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BadRequestException("Error al crear usuario: " + e.getMessage());
        }
    }


}
*/